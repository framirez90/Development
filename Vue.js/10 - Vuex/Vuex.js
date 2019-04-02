Vue.component('title', {
    template: //html
    `
    <div class="py-5 bg-success" >
        <h4>Son component: {{number}}</h4>
        <h4>Name: {{name}}</h4>W
        <button @click="number++">+</button> 
    </div>
    `,
});

const app = new Vue({
    el: '#app',
    data: {
        
    }
})