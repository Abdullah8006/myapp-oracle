$(document).ready(function() {

	$("#portfolio-contant-active").mixItUp();

	$("#testimonial-slider").owlCarousel({
		paginationSpeed : 500,
		singleItem : true,
		autoPlay : 3000,
	});

	$("#clients-logo").owlCarousel({
		autoPlay : 3000,
		items : 5,
		itemsDesktop : [ 1199, 5 ],
		itemsDesktopSmall : [ 979, 5 ],
	});

	$("#works-logo").owlCarousel({
		autoPlay : 3000,
		items : 5,
		itemsDesktop : [ 1199, 5 ],
		itemsDesktopSmall : [ 979, 5 ],
	});

	// google map
	var map;
	function initMap() {
		map = new google.maps.Map(document.getElementById('map'), {
			center : {
				lat : -34.397,
				lng : 150.644
			},
			zoom : 8
		});
	}

	// Counter

	$('.counter').counterUp({
		delay : 10,
		time : 1000
	});

});

// My main js
$(document).ready(function() {
	// alert("Bingo!! Main js loaded.");
	$("body").on("click", ".btn-sm", function(e) {
		var $this = $(this);
		$this.children("i").removeClass("hide");
		$.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "http://localhost:8091/myapp-oracle/api/v1/register",
	        data: JSON.stringify({
				username : $("#email1").val(),
				password : $("#exampleInputPassword1").val()
			}),
	        dataType: 'json',
	        cache: false,
	        success: function (data) {
	        	$("#myModal").modal("hide");
	            console.log("SUCCESS : ", data);
	        },
	        error: function (e) {
	        	$this.children("i").addClass("hide");
	        	$("#register-user .hidden").removeClass("hidden");
	        	console.log("Failure : ", data);
	        }
	    });
	});
	
	
});
