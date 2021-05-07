#!/usr/bin/env python3

# 1. curl https://dl.google.com/android/maven2/com/android/tools/build/group-index.xml
# 2. Parse xml
# 3. Get "gradle" tag, "versions" attribute
# 4. Split by ","
# 5. Delete everything before last known version
# 6. Pick next

import re
import requests
import xml.etree.ElementTree as ET

url = "https://dl.google.com/android/maven2/com/android/tools/build/group-index.xml"

payload = {}
headers = {}

response = requests.request("GET", url, headers=headers, data=payload)

contents = response.text.encode('utf8')
xml = ET.fromstring(contents)
versions = xml.find('./gradle').attrib['versions'].split(',')
stable_version_pattern = re.compile(r'[\d]+\.[\d]+\.[\d]+$')
versions = list(filter(lambda x: stable_version_pattern.match(x), versions))
with open('version.txt', 'r') as f:
    last_version = f.readline()
next_version = versions[versions.index(last_version.strip()) + 1]
with open('version.txt', 'w') as f:
    f.write(next_version)
print('::set-output name={name}::{value}'.format(name='version',
    value=next_version))
