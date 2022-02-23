cd;
mkdir -p test/test2/final;
cp /etc/issue test/test2/final;
echo "new row" >> test/test2/final/issue;
cp test/test2/final/issue test/test2/newdata;
chmod 600 test/test2/newdata

