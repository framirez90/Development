Vue.component('hello',{
    template: //html
    `
        <div>
            <h1>{{hello}}</h1>
            <h3>other</h3>
        </div>
    `,
    data(){
       return {
           hello: 'Components'
        }
    }
});

const app = new Vue({
    el: '#app',
    data: {
        hello: 'Out -  Components',
        count: 0
    }
})