// 定义一个名为 button-counter 的新组件
Vue.component('button-counter', {
    data: function () {
        return {
            count: 0
        }
    },
    template: '<button v-on:click="count++">You clicked me {{ count }} times.</button>'
});

var app = new Vue({
    el:'#app',
    data: {
        user:{
            name:'',
            tel:''
        },
        flag:true
    },
    methods:{
        regist:function () {
            
            this.$http.post('/user',this.user).then(function(res){
                if(res.body.success){
                    this.flag = false;
                }else{
                    alert('操作失败')
                }
            },function(){
                console.log('请求失败处理');
            });
        }
    }
});