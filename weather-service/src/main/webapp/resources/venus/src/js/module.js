$(".button.button-primary.button-wide-mobile.celcius").click(
		function() {
			var city = $(".button.button-wide-mobile.textbox").val();
			var unit = $(this).attr("value");
			var resp = $.parseJSON($.ajax(
					'http://localhost:7000/weather/temperature/' + unit + '/'
							+ city, {
						dataType : 'json',
						timeout : 500,
						async : false,
						success : function(data, status, xhr) {
						},
						error : function(jqXhr, textStatus, errorMessage) {
							$(".hero-cta.error-msg").css("display", "block");
							$(".data").css("display", "none");
							$(".button.button-primary.button-wide-mobile.error-msg").text(errorMessage);
						}
					}).responseText);
			$(".hero-cta").css("display", "block");
			$(".button.button-primary.button-wide-mobile.avg-temp").text("Average Tempaerature: " + resp.avgTemp);
			$(".button.button-primary.button-wide-mobile.max-temp").text("Maximum Tempaerature: " + resp.maxTemp);
			$(".button.button-primary.button-wide-mobile.min-temp").text("Minumum Tempaerature: " + resp.minTemp);
			$(".hero-cta.error-msg").css("display", "none");

			
		});

$(".button.button-primary.button-wide-mobile.farenhiet").click(
		function() {
			var city = $(".button.button-wide-mobile.textbox").val();
			var unit = $(this).attr("value");
			var resp = $.parseJSON($.ajax(
					'http://localhost:7000/weather/temperature/' + unit + '/'
							+ city, {
						dataType : 'json',
						timeout : 500,
						async : false,
						success : function(data, status, xhr) {
						},
						error : function(jqXhr, textStatus, errorMessage) {
							$(".hero-cta.error-msg").css("display", "block");
							$(".data").css("display", "none");
							$(".button.button-primary.button-wide-mobile.error-msg").text(errorMessage);
						}
					}).responseText);
			$(".hero-cta").css("display", "block");
			$(".button.button-primary.button-wide-mobile.avg-temp").text("Average Tempaerature: " + resp.avgTemp);
			$(".button.button-primary.button-wide-mobile.max-temp").text("Maximum Tempaerature: " + resp.maxTemp);
			$(".button.button-primary.button-wide-mobile.min-temp").text("Minumum Tempaerature: " + resp.minTemp);
			$(".hero-cta.error-msg").css("display", "none");

		});