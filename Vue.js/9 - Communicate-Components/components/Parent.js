Vue.component('Parent', {
    template: //html
    `
        <div class="p-5 bg-dark text-white">
            <h2>Parent component: {{parentNumber}}</h2>
            <button class="btn btn-danger" @click="parentNumber++">+</button>
            {{parentName}}
            <Son :number="parentNumber" @sonName="parentName = $event"></Son>
        </div>
    `,
    data(){
        return{
            parentNumber : 0,
            parentName: ''
        }
    }
});