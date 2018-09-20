(function() {

    var app= angular.module("store",[]);
        app.controller('storeController',function(){
            this.products=gems;

        });
    
    app.controller("PanelController",function(){
        this.tab=1;

        this.selectTab = function(setTab){
            this.tab=setTab;

        };
        this.isSelected=function(checkTab){
            return this.tab==checkTab;
        };
    });

    app.controller("ReviewController",function(){
        this.review={};

        this.addReview=function(product){
            product.reviews.push(this.review);
            this.review={};
        };

    })
    
    var gems=[
    {
            name:'Dodecahedrone',
            price: 2.99,
            description:'Aapki aukat mein hai, khareed lo..!!',
            canPurchase:true,
            soldOut:false,
            images:["gem1.jpg","gem2.jpg"],
            reviews:[
                {
                    stars: 5,
                    body:"I'm loving it...!!!",
                    author:"Baburao Ganpatrao Apte"
                },
                {
                    stars: 4,
                    body:"I'm loving it too...!!!",
                    author:"Ayeee Raju"
                }
            ]


    },
    {
        name:'Pentagonal',
        price: 12.99,
        description:'Bahut mehenga hai bhai..!!',
        canPurchase:false,
        soldOut:true,
        images:["gem3.png","gem4.jpg"],
        reviews:[
            {
                stars: 3,
                body:"I'm loving it...!!!",
                author:"Khaye kaaju"
            },
            {
                stars: 1,
                body:"I'm loving it too...!!!",
                author:"paaade aaju baaju"
            }
        ]


}
    ]
})();