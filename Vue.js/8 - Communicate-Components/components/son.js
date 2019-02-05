Vue.component('son', {
    template: //html
    `
        <div class="py-5 bg-success" >
            <h4>Son component: {{number}}</h4>
        </div>
    `,
    props: ['number']
});