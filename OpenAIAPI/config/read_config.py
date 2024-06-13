import os
import yaml

class Config():
    def __init__(self):
        self.current_dir = os.path.dirname(os.path.abspath(__file__))
        self.yaml_path = os.path.join(self.current_dir,'config.yaml')
    def read_config(self):
        with open(self.yaml_path,"r") as f:
            config = yaml.safe_load(f)
        return config
