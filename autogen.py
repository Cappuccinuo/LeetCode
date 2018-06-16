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

# The category path
my_file_path = path.join(dirpath, category_path)
# The template path
template_path = path.join(dirpath, 'Template/')
# The problem path
problem_path = path.join(my_file_path, problem_name)
if not path.exists(problem_path):
    os.makedirs(problem_path)    

template_file = os.listdir(template_path)

for template in template_file:
    full_template_name = os.path.join(template_path, template)
    if (path.isfile(full_template_name)):
        copy2(full_template_name, problem_path)
