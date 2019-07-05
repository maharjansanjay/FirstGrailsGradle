$(function() {
    fgg.CreateNamespace('fgg.home');
    (function(context){

        context.TestInitialize = function(){
            $.ajax({
                url: '/home/index',
                method: 'GET',
                success: function(e){
                    console.log(e);
                },
                error: function(e){
                    console.log(e);
                }
            });
        }

    })(fgg.home);
});