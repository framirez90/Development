Vue.component('Son', {
    template: //html
    `
        <div class="py-5 bg-success" >
            <h4>Son component: {{number}}</h4>
            <h4>Name: {{name}}</h4>
            <button @click="number++">+</button> 
        </div>
    `,
    props: ['number'],
    data(){
        return{
            name: 'James'
        }
    },
    mounted(){
        this.$emit('sonName', this.name)
    }
});