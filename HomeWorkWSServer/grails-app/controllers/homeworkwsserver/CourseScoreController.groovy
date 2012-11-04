package homeworkwsserver

import org.springframework.dao.DataIntegrityViolationException

class CourseScoreController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [courseScoreInstanceList: CourseScore.list(params), courseScoreInstanceTotal: CourseScore.count()]
    }

    def create() {
        [courseScoreInstance: new CourseScore(params)]
    }

    def save() {
        def courseScoreInstance = new CourseScore(params)
        if (!courseScoreInstance.save(flush: true)) {
            render(view: "create", model: [courseScoreInstance: courseScoreInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), courseScoreInstance.id])
        redirect(action: "show", id: courseScoreInstance.id)
    }

    def show() {
        def courseScoreInstance = CourseScore.get(params.id)
        if (!courseScoreInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "list")
            return
        }

        [courseScoreInstance: courseScoreInstance]
    }

    def edit() {
        def courseScoreInstance = CourseScore.get(params.id)
        if (!courseScoreInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "list")
            return
        }

        [courseScoreInstance: courseScoreInstance]
    }

    def update() {
        def courseScoreInstance = CourseScore.get(params.id)
        if (!courseScoreInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (courseScoreInstance.version > version) {
                courseScoreInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'courseScore.label', default: 'CourseScore')] as Object[],
                        "Another user has updated this CourseScore while you were editing")
                render(view: "edit", model: [courseScoreInstance: courseScoreInstance])
                return
            }
        }

        courseScoreInstance.properties = params

        if (!courseScoreInstance.save(flush: true)) {
            render(view: "edit", model: [courseScoreInstance: courseScoreInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), courseScoreInstance.id])
        redirect(action: "show", id: courseScoreInstance.id)
    }

    def delete() {
        def courseScoreInstance = CourseScore.get(params.id)
        if (!courseScoreInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "list")
            return
        }

        try {
            courseScoreInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'courseScore.label', default: 'CourseScore'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
