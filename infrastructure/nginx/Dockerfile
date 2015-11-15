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

# Cleanup
RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# Expose port
EXPOSE 80
EXPOSE 443

CMD /etc/init.d/nginx-naxsi-ui start && nginx
