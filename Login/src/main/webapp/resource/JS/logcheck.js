
$(document).ready(function() {
        $('#user').blur(function() {
                var name = $('#user').val()
                $.get('checking', {
                        username : name
                }, function(responseText) {
                        alert(responseText);
                });
        });
});