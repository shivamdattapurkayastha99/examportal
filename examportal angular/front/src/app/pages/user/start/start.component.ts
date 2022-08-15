import { LocationStrategy } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { QuestionService } from 'src/app/services/question.service';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css']
})
export class StartComponent implements OnInit {
  [x: string]: boolean;
  qid:any
  questions:any
  marksGot=0
  correctAnswers=0
  attempted=0



  constructor(private locationSt:LocationStrategy,private _route:ActivatedRoute,private _question:QuestionService) { }

  ngOnInit(): void {
    this.preventBackButton();
    this.qid=this._route.snapshot.params.qid;
    this.loadQuestions()


  }
  loadQuestions(){
    this._question.getQuestionsofQuizForTest(this.qid).subscribe((data:any)=>{
      console.log(data);
      this.questions=data
      this.questions.forEach((q: any) => {
        q['givenAnswer']='';

        
      });
      
    },(error)=>{
      console.log(error);
      
    })
  }
  preventBackButton(){
    history.pushState(null,null,location.href);
    this.locationSt.onPopState(()=>{
      history.pushState(null,null,location.href)

    })
  }
  submitQuiz(){
    this['isSubmit']=true
    this.questions.forEach((q: { givenAnswer: any; answer: any; })=>{
      if (q.givenAnswer==q.answer) {
        this.correctAnswers++
        let marksSingle=this.questions[0].quiz.maxMarks/this.questions.length
        this.marksGot+=marksSingle

        
      }
      if (q.givenAnswer.trim()!='') {
        this.attempted++;

        
      }
    })
  }
}
