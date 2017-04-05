import org.codehaus.groovy.runtime.typehandling.NumberMath

/**
 * @author songgl
 * @since 2016-05-23 19:54
 */

//当年第几周 w: week in year
//当月第几周 W: week in month
println new Date((long)1490944975000).format('yyyyw');

def doc1=[
    // 'startSellTime':1490944975,
    'isMainly':0
];
score=0;
if(doc1.containsKey("startSellTime")&&doc1["startSellTime"].value>0){ 
    score = new Date((long)(doc1["startSellTime"].value)*1000).format("yyyyMMdd");
    //时间戳毫秒,所以 *1000
};
if(doc1.containsKey("isMainly")&&doc1["isMainly"].value>0){
    score+=0.1;
}
println score;

//date format 
println Date.parse('yyyy-MM-dd hh:MM:SS', '2012-12-11 00:00:00').format('yyyyMMdd');

//timestamp to date
println new Date(1490944975L*1000).format('yyyy-MM-dd');

score =  new Date(1490944975L*1000).format('yyyyMMdd');
println score;
score+=0.1;
println score;

//range
def range = 0..5
println range.class;
assert range instanceof List

//数组
def array  = ['Java','Groovy']
println array*.toUpperCase();
println array*.toLowerCase();

//hash
def hash = [name:"Andy", "VPN-#":45]
println hash.get('name')
println hash.name
println hash.getClass()
hash['age']=111;
println hash.age
hash.sex ='male'
println hash.sex


//闭包
def users = ['Java','php','go','groovy'];
users.each {
    println it
}
def user=['name':'sgl','addr':'china'];
user.each { key, value ->
    println "${key} : ${value}";
}
"SLWWWLKSnnds".each {
    println it.toLowerCase();
}


def doc = [
    'goodsId'       : 11111111111111,
    'businessUserId': 654321,
    'soldOut'       : 0,
    'useCount'      : 12,
    'createTime'    :  86400
];
def businessUserIds = [654321, 123456];

def compute(doc,bus) {
    arg_a = 100;
    arg_b = 200;
    arg_c = 0.4;
    arg_d = 0.5;
    score = 0.0;
    if(doc['goodsId'].value){
        if (bus.contains(doc['businessUserId'])) {
            score+=arg_a;
        }

        if (!doc['soldOut']) {
            score += arg_b;
        }
    }
    score += (doc['useCount'] * arg_c);
    println score;
    score -= Math.floor((172800 - doc['createTime']) / 86400) * arg_d;
    println score;
}
compute(doc,businessUserIds);
//除法
println NumberMath.divide(2, 4)
println NumberMath.divide(0, 4)
//println NumberMath.divide(2, 0) //Exception
