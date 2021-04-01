import os
from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_migrate import Migrate

basedir=os.path.abspath(os.path.dirname(__file__))  #.abspath return abs path of parameter -> so basedir is the abs path
                                           #where the program resides
app=Flask(__name__)             # ob ject of flask class is a wsgi application
app.config['SECRET_KEY']="secret-key"
app.config['SQLALCHEMY_DATABASE_URI']='sqlite:///' + os.path.join(basedir,'data.db')
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

data=SQLAlchemy(app)
Migrate(app,data)

class Task(data.Model):
    id=data.Column(data.Integer,primary_key=True)
    title=data.Column(data.String(100),nullable=False)
    date=data.Column(data.Date,nullable=False)
    def __init__(self,title,date):
        self.title=title
        self.date=date
    def __repr__(self):
        return f'{self.title} -> Created on {self.date}'


from routes import *


if __name__ == '__main__':
    app.run(debug=True)
