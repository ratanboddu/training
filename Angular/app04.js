(function() {

    var app= angular.module("store",[]);
        app.controller('storeController',function(){
            this.products=gems;

        });
    
    var gems=[
    {
            name:'Dodecahedrone',
            price: 2.99,
            description:'Aapki aukat mein hai, khareed lo..!!',
            canPurchase:true,
            soldOut:false,
            images:["gem1.jpg","gem2.jpg"]


    },
    {
        name:'Pentagonal',
        price: 12.99,
        description:'Bahut mehenga hai bhai..!!',
        canPurchase:false,
        soldOut:true,
        images:["gem3.png","gem4.jpg"]


}
    ]
})();