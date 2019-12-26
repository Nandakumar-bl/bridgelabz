$(document).ready(function() {
        $('#userName').blur(function() {
                var name = $('#userName').val();
                $.get('registerq', {
                        username : name
                }, function(responseText) {
                        $("#userName").val(responseText);
                });
        });
});