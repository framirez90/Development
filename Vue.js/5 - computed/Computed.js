const app = new Vue({
    el: '#app',
    data: {
        message: 'Computed',
        count: 0
    },
    computed:{
        reverse(){
            return this.message.split('').reverse().join('');
        },
        color(){
            return{
                'bg-success' : this.count <= 10,
                'bg-warning' : this.count >= 10 && this.count < 20,
                'bg-danger' : this.count >= 20
            }
        }
    }
})