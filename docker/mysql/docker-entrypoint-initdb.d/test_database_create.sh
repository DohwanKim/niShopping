#!/bin/sh

echo "CREATE DATABASE IF NOT EXISTS \`iv_shopping_test\` ;" | "${mysql[@]}"
echo "GRANT ALL ON \`iv_shopping_test\`.* TO '"$MYSQL_USER"'@'%' ;" | "${mysql[@]}"
echo "FLUSH PRIVILEGES ;" | "${mysql[@]}"