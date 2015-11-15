FROM debian:wheezy

ENV DEBIAN_FRONTEND noninteractive

RUN \
        echo deb http://http.debian.net/debian wheezy-backports main >> /etc/apt/sources.list \
        && echo 'APT::Install-Recommends "0";' > /etc/apt/apt.conf.d/99norecommends \
        && sed -i 's/deb/deb [arch=amd64]/' /etc/apt/sources.list \
        && apt-get update \
        && apt-get -f -y dist-upgrade \
        && apt-get -f -y upgrade \
        && apt-get install -y nginx-naxsi-ui \
        && sed -i '1i\daemon off;' /etc/nginx/nginx.conf \
        && sed -i 's|#.*server_tokens off|server_tokens off|' /etc/nginx/nginx.conf \
        && sed -i 's|#.*include /etc/nginx/naxsi_core.rules|include /etc/nginx/naxsi_core.rules|' /etc/nginx/nginx.conf \
        && sed -i 's|access_log /var/log/nginx/access.log|access_log off|' /etc/nginx/nginx.conf \
        && sed -i 's|error_log /var/log/nginx/error.log|error_log /dev/null|' /etc/nginx/nginx.conf

ADD . /etc/nginx

# Cleanup
RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# Expose port
EXPOSE 80
EXPOSE 443

CMD \
        /etc/init.d/nginx-naxsi-ui start \
        && nginx
