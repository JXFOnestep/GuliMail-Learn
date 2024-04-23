docker run -p 80:80 --name nginx \
-v /Users/jiangxufeng/Documents/study/JavaWorkPlace/gulimall-study/environment/nginx/html:/usr/share/nginx/html \
-v /Users/jiangxufeng/Documents/study/JavaWorkPlace/gulimall-study/environment/nginx/logs:/var/log/nginx \
-v /Users/jiangxufeng/Documents/study/JavaWorkPlace/gulimall-study/environment/nginx/conf:/etc/nginx \
-d nginx:latest
