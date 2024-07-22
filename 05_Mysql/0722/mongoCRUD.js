use test;

db.users.find();


db.users.insertOne({name : "공연정",age :25});



db.users.insertMany([{name : "최현수",age :27},{name : "이태웅",age :27}]);

db.users.insertOne({name : "뽀로로",age :9});
db.users.insertOne({name : "루피",age :8});

db.users.insertMany([{name : "이승아",age :27},{name : "이예지",age :26},{name : "김서연",age :25}]);

db.users.updateOne(
{name : "na"},
{$set : {name : "나건우"} }
);

db.users.updateMany({name : {$ne : "나건우"} }, 
{$set : {position : "RM 아님"} } );

db.users.updateMany({age : {$lte : 30} }, 
{$set : {status: "파릇파릇함"} } );

db.users.deleteOne({name : "뽀로로"});
db.users.deleteMany({age : {$lte:10}});

db.users.findOne({name:"최민준"});
db.users.find({age : {$lte:26}});


db.users.find(

    {$and : [
     {position : "RM"},
     {age:{$gt : 20}}   
     ]}


);
db.users.find(
    {$or : [
     {name : "최민준"},
     {age:{$lt : 25}}   
     ]}
);






