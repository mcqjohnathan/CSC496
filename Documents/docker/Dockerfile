FROM nginx
COPY . /usr/share/nginx/html


WORKDIR /docker

COPY . .


EXPOSE 5000


CMD ["nginx", "-g", "daemon off;"]

