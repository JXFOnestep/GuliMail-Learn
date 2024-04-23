docker run -p 6379:6379 --name redis \
-v /Users/jiangxufeng/Documents/study/JavaWorkPlace/gulimall-study/environment/redis/data:/data \
-v /Users/jiangxufeng/Documents/study/JavaWorkPlace/gulimall-study/environment/redis/conf/redis.conf:/etc/redis/redis.conf \
-d redis redis-server /etc/redis/redis.conf

