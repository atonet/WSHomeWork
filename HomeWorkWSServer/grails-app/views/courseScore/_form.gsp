<%@ page import="homeworkwsserver.CourseScore" %>



<div class="fieldcontain ${hasErrors(bean: courseScoreInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="courseScore.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${homeworkwsserver.Student.list()}" optionKey="id" required="" value="${courseScoreInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseScoreInstance, field: 'course', 'error')} required">
	<label for="course">
		<g:message code="courseScore.course.label" default="Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course" name="course.id" from="${homeworkwsserver.Course.list()}" optionKey="id" required="" value="${courseScoreInstance?.course?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseScoreInstance, field: 'score', 'error')} required">
	<label for="score">
		<g:message code="courseScore.score.label" default="Score" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="score" from="${0..100}" class="range" required="" value="${fieldValue(bean: courseScoreInstance, field: 'score')}"/>
</div>

