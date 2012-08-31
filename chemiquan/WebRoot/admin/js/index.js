function scContent(id){
	$('#'+id).slideToggle("slow").siblings("#"+id+":visible").slideUp("slow");
}

