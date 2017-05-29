$(document).ready(function(){
	  $('select').material_select();
    jQuery.support.cors = true;

    $.ajax(
    {
        type: "GET",
        url: '/ubis/list_events',
        data: "{}",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        cache: false,
        success: function (data) {

        	var options = $("#Events");
        	$.each(data, function() {
        	    options.append($("<option  />").val(this.id).text(this.name));
        	});
      	  $('select').material_select();

//        
        },
        
        error: function (msg) {
            
            alert(msg.responseText);
        }
    });
})



