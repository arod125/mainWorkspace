
function openNav() {
    document.getElementById("left").style.height = "100%";
    document.getElementById("right").style.height = "100%";
    document.getElementById("menuWrapper").style.height = "100%";
}

function closeNav() {
    document.getElementById("left").style.height = "0";
    document.getElementById("right").style.height = "0";
    document.getElementById("menuWrapper").style.height = "0%";
}

$("#btn").click(function() {
    $('html, body').animate({
        scrollTop: $("#myDiv").offset().top
    }, 2000);
});