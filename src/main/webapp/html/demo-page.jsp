This is just a sample page, calling REST controller.

<br />

Today: ${today}

<br />

<div id="result">
</div>

<script>
	var request = new XMLHttpRequest();
	var url = "/liferay-spring-rest-portlet/services/users";

	alert("Before calling "+url);
	
	request.open("GET", url, true);
	request.send();
	request.onreadystatechange = function() {
		if(request.readyState == 4) {
			alert("After calling "+url);
			document.getElementById("result").innerHTML = request.responseText;
		}
	};
</script>