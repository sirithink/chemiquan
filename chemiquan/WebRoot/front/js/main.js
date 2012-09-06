function showButtonOver(id){
	$('#'+id).css('display','block');
}

function showButtonOut(id){
	$('#'+id).css('display','none');
}

function showTagClick(num,length,name,classname){
	for(var i = 1; i <= length; i++){
		$('#'+name+'_li'+i).removeClass(classname);
		$('#'+name+'_'+i).css('display','none');
	}
	$('#'+name+'_li'+num).addClass(classname);
	$('#'+name+'_'+num).css('display','block');
	
}

