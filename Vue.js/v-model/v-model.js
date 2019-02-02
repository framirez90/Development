const app = new Vue({
    el: '#app',
    data: {
        nameModule: "v-model",
        fruitName: '',
        fruitStock: 0,
        total: 0,
        fruits: [
            {name:'Orange', stock: 0},
            {name:'Apple', stock: 10},
            {name:'Pineaple', stock: 42},
            {name:'Banana', stock: 18}
        ]
    },
    methods: {
        addFruit(){
            this.fruits.push({
                name: this.fruitName,
                stock: this.fruitStock
            })
            this.fruitName = "";
            this.fruitStock = "";
        },
    },
    computed: {
        sumFruits(){
            this.total = 0;
            for(fruit of this.fruits){
                this.total += fruit.stock;
            }
            return this.total;
        }
    }
})