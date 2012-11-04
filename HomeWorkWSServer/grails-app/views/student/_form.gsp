<%@ page import="homeworkwsserver.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'no', 'error')} ">
	<label for="no">
		<g:message code="student.no.label" default="No" />
		
	</label>
	<g:textField name="no" value="${studentInstance?.no}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${studentInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="student.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${studentInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'tel', 'error')} ">
	<label for="tel">
		<g:message code="student.tel.label" default="Tel" />
		
	</label>
	<g:textField name="tel" value="${studentInstance?.tel}"/>
</div>

