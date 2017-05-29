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
														alert(this.buytime)
														options
																.append('<div>'
																		+ this.id
																		+ new Date( this.buytime).customFormat("#DD#/#MM#/#YYYY# #hh#:#mm#:#ss#")
																		+ this.account.username
																		+ this.event.name
																		+ new Date(this.event.date).customFormat("#DD#/#MM#/#YYYY# #hh#:#mm#:#ss#")
																		+ this.event.organizer
																		+ '</div><br>');
													});
									//        
								},

								error : function(msg) {

									alert(msg.responseText);
								}
							});
				})
