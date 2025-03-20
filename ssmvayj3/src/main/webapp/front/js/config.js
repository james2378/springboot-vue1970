
var projectName = '金旗帜文化培训学校网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '课程介绍',
	url: './pages/kechengjieshao/list.html'
}, 
{
	name: '师资力量',
	url: './pages/shizililiang/list.html'
}, 
{
	name: '线上教学资源',
	url: './pages/xianshangjiaoxueziyuan/list.html'
}, 
{
	name: '学校简介',
	url: './pages/xuexiaojianjie/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssmvayj3/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程介绍","menuJump":"列表","tableName":"kechengjieshao"}],"menu":"课程介绍管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程类型","menuJump":"列表","tableName":"kechengleixing"}],"menu":"课程类型管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程预约","menuJump":"列表","tableName":"kechengyuyue"}],"menu":"课程预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"师资力量","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"线上教学资源","menuJump":"列表","tableName":"xianshangjiaoxueziyuan"}],"menu":"线上教学资源管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学校简介","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"学校简介管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"在线交流","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"课程介绍列表","menuJump":"列表","tableName":"kechengjieshao"}],"menu":"课程介绍模块"},{"child":[{"buttons":["查看"],"menu":"师资力量列表","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量模块"},{"child":[{"buttons":["查看"],"menu":"线上教学资源列表","menuJump":"列表","tableName":"xianshangjiaoxueziyuan"}],"menu":"线上教学资源模块"},{"child":[{"buttons":["查看"],"menu":"学校简介列表","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"学校简介模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","预约"],"menu":"课程介绍","menuJump":"列表","tableName":"kechengjieshao"}],"menu":"课程介绍管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"课程预约","menuJump":"列表","tableName":"kechengyuyue"}],"menu":"课程预约管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"课程介绍列表","menuJump":"列表","tableName":"kechengjieshao"}],"menu":"课程介绍模块"},{"child":[{"buttons":["查看"],"menu":"师资力量列表","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量模块"},{"child":[{"buttons":["查看"],"menu":"线上教学资源列表","menuJump":"列表","tableName":"xianshangjiaoxueziyuan"}],"menu":"线上教学资源模块"},{"child":[{"buttons":["查看"],"menu":"学校简介列表","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"学校简介模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"课程预约","menuJump":"列表","tableName":"kechengyuyue"}],"menu":"课程预约管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"课程介绍列表","menuJump":"列表","tableName":"kechengjieshao"}],"menu":"课程介绍模块"},{"child":[{"buttons":["查看"],"menu":"师资力量列表","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量模块"},{"child":[{"buttons":["查看"],"menu":"线上教学资源列表","menuJump":"列表","tableName":"xianshangjiaoxueziyuan"}],"menu":"线上教学资源模块"},{"child":[{"buttons":["查看"],"menu":"学校简介列表","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"学校简介模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
