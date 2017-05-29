$(document).ready(function(){

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

        	var options = $("#events");
        	$.each(data, function() {
        		//alert(this.id + this.name)
//        	    options.append($("<option />").val(this.id).text(this.name));
        		 options.append('<tr><td>' + this.id + '</td><td>' + this.name + '</td><td>'+ new Date(this.date).customFormat( "#DD#/#MM#/#YYYY# #hh#:#mm#:#ss#" ) + '</td><td>'+ this.organizer + '</td></tr>');
        	});
//        
        },
        
        error: function (msg) {
            
            alert(msg.responseText);
        }
    });
})
