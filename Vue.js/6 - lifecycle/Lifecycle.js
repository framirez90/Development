const app = new Vue({
    el: '#app',
    data: {
        message: 'Lifecycle'
    },
    beforeCreate(){
        console.log("beforeCreate");
    },
    created(){
        console.log("created");
    },
    beforeMount(){
        console.log("beforeMount");
    },
    mounted(){
        console.log("mounted");
    },
    beforeUpdate(){
        console.log("beforeUptade");
    },
    updated(){
        console.log("updated");
    },
    beforeDestroy(){
        console.log("beforeDestroy");
    },
    destroyed(){
        console.log("destroyed");
    },
    methods:{
        destroy(){
            this.$destroy();
        }
    }
})