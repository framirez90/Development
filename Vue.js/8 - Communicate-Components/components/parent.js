Vue.component('parent', {
    template: //html
    `
        <div class="p-5 bg-dark text-white">
            <h2>Parent component: {{parentNumber}}</h2>
            <button class="btn btn-danger" @click="parentNumber++">+</button>
            <son :number="parentNumber"></son>
        </div>
    `,
    data(){
        return{
            parentNumber : 0
        }
    }
});