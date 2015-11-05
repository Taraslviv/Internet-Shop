$('#show-customer-name').click(show);

function show() {
	$ajax({
		url:"authenteficated",
		type:"POST"	
	});
}
