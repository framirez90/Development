#!/bin/bash

dep_ubuntu="dep1 dep2 dep3 dep4 dep5"

length=$(echo $dep_ubuntu | wc -w)
    
for pkg in $dep_ubuntu; do
    echo "Processing ${pkg}, Package $pkg of $length"
done