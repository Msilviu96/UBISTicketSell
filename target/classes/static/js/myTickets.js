$(document)
		.ready(
				function() {

					jQuery.support.cors = true;

					$
							.ajax({
								type : "GET",
								url : '/ubis/get_user_tickets',
								data : "{}",
								contentType : "application/json; charset=utf-8",
								dataType : "json",
								cache : false,
								success : function(data) {
									var options = $("#tickets");
									$
											.each(
													data,
													function() {

														options
																.append('<div class="col s12 m6"><div class="card"> <div class="card-image waves-effect waves-block waves-light"> <img class="activator" src="'
																		+ this.event.photoUrl
																		+ '" height=220px> </div> <div class="card-content"> <span class="card-title activator grey-text text-darken-4">'
																		+ this.event.name
																		+ '<i class="material-icons right">more_vert</i> </span> </div> <div class="card-action"> <a href="#" onClick="cancelTicket('
																		+ this.id
																		+ ')">Cancel ticket</a> </div> 	<div class="card-reveal"> <span class="card-title grey-text text-darken-4">'
																		+ this.event.name
																		+ '<i class="material-icons right">close</i> </span> <p>'
																		+ 'Event id:  '
																		+ this.event.id
																		+ '<br>'
																		+ 'Event date:  '
																		+ new Date(this.event.date).customFormat("#DD#/#MM#/#YYYY# #hh#:#mm#:#ss#")
																		+ '<br>'
																		+ 'Event organizer:  '
																		+ this.event.organizer
																		+ '<br>'
																		+ 'Ticket bought on:  '
																		+ new Date(this.buytime).customFormat("#DD#/#MM#/#YYYY# #hh#:#mm#:#ss#")
																		+ '<br>'
																		+ '</p> </div> </div> </div>')

													});
									//        
								},

								error : function(msg) {

									alert(msg.responseText);
								}
							});
				})

