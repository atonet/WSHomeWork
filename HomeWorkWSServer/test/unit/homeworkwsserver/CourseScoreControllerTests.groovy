package homeworkwsserver



import org.junit.*
import grails.test.mixin.*

@TestFor(CourseScoreController)
@Mock(CourseScore)
class CourseScoreControllerTests {


    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/courseScore/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.courseScoreInstanceList.size() == 0
        assert model.courseScoreInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.courseScoreInstance != null
    }

    void testSave() {
        controller.save()

        assert model.courseScoreInstance != null
        assert view == '/courseScore/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/courseScore/show/1'
        assert controller.flash.message != null
        assert CourseScore.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/courseScore/list'


        populateValidParams(params)
        def courseScore = new CourseScore(params)

        assert courseScore.save() != null

        params.id = courseScore.id

        def model = controller.show()

        assert model.courseScoreInstance == courseScore
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/courseScore/list'


        populateValidParams(params)
        def courseScore = new CourseScore(params)

        assert courseScore.save() != null

        params.id = courseScore.id

        def model = controller.edit()

        assert model.courseScoreInstance == courseScore
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/courseScore/list'

        response.reset()


        populateValidParams(params)
        def courseScore = new CourseScore(params)

        assert courseScore.save() != null

        // test invalid parameters in update
        params.id = courseScore.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/courseScore/edit"
        assert model.courseScoreInstance != null

        courseScore.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/courseScore/show/$courseScore.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        courseScore.clearErrors()

        populateValidParams(params)
        params.id = courseScore.id
        params.version = -1
        controller.update()

        assert view == "/courseScore/edit"
        assert model.courseScoreInstance != null
        assert model.courseScoreInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/courseScore/list'

        response.reset()

        populateValidParams(params)
        def courseScore = new CourseScore(params)

        assert courseScore.save() != null
        assert CourseScore.count() == 1

        params.id = courseScore.id

        controller.delete()

        assert CourseScore.count() == 0
        assert CourseScore.get(courseScore.id) == null
        assert response.redirectedUrl == '/courseScore/list'
    }
}
