import os
from os import path
from shutil import copy2
from argparse import ArgumentParser
parser = ArgumentParser()

parser.add_argument("category",
                    help="the category of the problem, for example Dynamic Programming")
parser.add_argument("title",
                    help="the title of the problem, for example 1. Two Sum")

args = parser.parse_args()
category_path = args.category
problem_name = args.title

dirpath = os.getcwd()

my_file_path = path.join(dirpath, category_path)
template_path = path.join(dirpath, 'Template/')
problem_path = path.join(my_file_path, problem_name)

template_file = os.listdir(template_path)

for template in template_file:
    full_template_name = os.path.join(template_path, template)
    if (path.isfile(full_template_name)):
        copy2(full_template_name, my_file_path)
