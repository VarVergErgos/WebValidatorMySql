
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE>

<html>

<head>

<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

<!-- Javascript -->
<script>  
         $(function() {  
            $( "#datepicker-3" ).datepicker({  
               appendText:"",
               dayNamesMin: [ "So", "Mo", "Di", "Mi", "Do", "Fr", "Sa" ],
               dateFormat:"dd.mm.yy",  
               altField: "#datepicker-4",  
               altFormat: "DD, d MM, yy"  
            });  
         }); 
         
     
         $(function() {  
             $( "#datepicker-5" ).datepicker({  
                appendText:"",
                dayNamesMin: [ "So", "Mo", "Di", "Mi", "Do", "Fr", "Sa" ],
                dateFormat:"yy-mm-dd",  
                altField: "#datepicker-6",  
                altFormat: "DD, d MM, yy"  
             });  
          }); 
          
         
         
    
         
         
         
      </script>


<title>Save Customer</title>

<style>
.error {
	color: purple;
}
</style>


<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>




<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>

		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">


			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /> <form:errors
								path="firstName" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /> <form:errors
								path="lastName" cssClass="error" /></td>

					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /> <form:errors path="email"
								cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Date:</label></td>
						<td><form:input path="entry" id="datepicker-3"
								placeholder="dd.mm.JJJJ" /> <form:errors path="entry"
								cssClass="error" /></td>

					</tr>

					<tr>
						<td><label>Minimum:</label></td>
						<td><form:input path="minimum" /> <form:errors path="minimum"
								cssClass="error" /></td>
					</tr>
					
					
						<tr>
						<td><label>Birthday:</label></td>
						<td><form:input path="birthday" id="datepicker-5"
								placeholder="yyyy-mm-dd" /> <form:errors path="birthday"
								cssClass="error" /></td>

					</tr>
					
					<tr>
						<td><label>PostalCode:</label></td>
						<td><form:input path="postalCode" /> <form:errors path="postalCode"
								cssClass="error" /></td>
					</tr>
					
					<tr>
						<td><label>CourseCode:</label></td>
						<td><form:input path="courseCode" /> <form:errors path="courseCode"
								cssClass="error" /></td>
					</tr>
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>


				</tbody>
			</table>


		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back
				to List</a>
		</p>

	</div>

</body>

</html>










