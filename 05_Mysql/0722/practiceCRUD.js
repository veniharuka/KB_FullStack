use test2;

db.users.find();

db.users.insertOne({name:"권오현",age:32});

db.users.insertMany([{name:"정지희",age:25},
{name:"김이수",age:25},
{name:"나건우",age:27},
{name:"김시완",age:30}]
);

db.users.insertOne({name:"이효석",age:40});
db.users.updateOne(   {age:{$gte:37}},
{$set:{stats:"늙음"}}
);

db.users.deleteMany(
{$and : [{age:{$gte:37}},  {name : "이효석"}]}

);

db.users.find({age:{$gte:25}});





