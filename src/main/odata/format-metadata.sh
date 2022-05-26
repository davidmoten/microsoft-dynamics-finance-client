#!/bin/bash
set -e
xmllint --format microsoft-dynamics-finance-metadata.xml >/tmp/metadata.xml
cp /tmp/metadata.xml microsoft-dynamics-finance-metadata.xml 


