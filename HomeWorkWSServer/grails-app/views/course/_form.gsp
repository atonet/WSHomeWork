<%@ page import="homeworkwsserver.Course" %>



<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'no', 'error')} ">
	<label for="no">
		<g:message code="course.no.label" default="No" />
		
	</label>
	<g:textField name="no" value="${courseInstance?.no}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="course.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${courseInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'teacher', 'error')} ">
	<label for="teacher">
		<g:message code="course.teacher.label" default="Teacher" />
		
	</label>
	<g:textField name="teacher" value="${courseInstance?.teacher}"/>
</div>

