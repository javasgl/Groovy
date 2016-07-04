import org.codehaus.groovy.runtime.typehandling.NumberMath

/**
 * @author songgl
 * @since 2016-05-23 19:54
 */
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