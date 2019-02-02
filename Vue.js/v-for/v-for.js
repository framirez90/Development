const app = new Vue({
    el: '#app',
    data: {
        array: 'v-for with array',
        languages: [
            'Node.js',
            'Vue.js',
            'Angular JS',
            'Javascript'
        ],
        json: 'v-for with json',
        fruits: [
            {name:'Orange', stock: '0'},
            {name:'Apple', stock: '10'},
            {name:'Pineaple', stock: '42'},
            {name:'Banana', stock: '18'}
        ]
    }
})