package com.example.lottogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import java.util.*
import android.widget.*
import android.app.AlertDialog
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.input_fifth_game_spinner.*
import kotlinx.android.synthetic.main.input_first_game_spinner.*
import kotlinx.android.synthetic.main.input_fourth_game_spinner.*
import kotlinx.android.synthetic.main.input_second_game_spinner.*
import kotlinx.android.synthetic.main.input_third_game_spinner.*
import java.lang.StringBuilder
import java.text.FieldPosition
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    private var mFirstGameNumbers: MutableMap<Int, Int> = HashMap()
    private var mSecondGameNumbers: MutableMap<Int, Int> = HashMap()
    private var mThirdGameNumbers: MutableMap<Int, Int> = HashMap()
    private var mFourthGameNumbers: MutableMap<Int, Int> = HashMap()
    private var mFifthGameNumbers: MutableMap<Int, Int> = HashMap()

    private var mWinNumbers:MutableMap<Int, Int> = HashMap()
    private var mBonusNum: Int=0
    private lateinit var mResultText: StringBuilder

    private val mItemSelectedListener=object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            onFirstGameItemSelected(parent, position)
            onSecondGameItemSelected(parent, position)
            onThirdGameItemSelected(parent, position)
            onFourthGameItemSelected(parent, position)
            onFifthGameItemSelected(parent, position)
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }
    }

    private fun setListener(){
        first_number1.onItemSelectedListener=mItemSelectedListener
        first_number2.onItemSelectedListener=mItemSelectedListener
        first_number3.onItemSelectedListener=mItemSelectedListener
        first_number4.onItemSelectedListener=mItemSelectedListener
        first_number5.onItemSelectedListener=mItemSelectedListener
        first_number6.onItemSelectedListener=mItemSelectedListener

        second_number1.onItemSelectedListener=mItemSelectedListener
        second_number2.onItemSelectedListener=mItemSelectedListener
        second_number3.onItemSelectedListener=mItemSelectedListener
        second_number4.onItemSelectedListener=mItemSelectedListener
        second_number5.onItemSelectedListener=mItemSelectedListener
        second_number6.onItemSelectedListener=mItemSelectedListener

        third_number1.onItemSelectedListener=mItemSelectedListener
        third_number2.onItemSelectedListener=mItemSelectedListener
        third_number3.onItemSelectedListener=mItemSelectedListener
        third_number4.onItemSelectedListener=mItemSelectedListener
        third_number5.onItemSelectedListener=mItemSelectedListener
        third_number6.onItemSelectedListener=mItemSelectedListener

        fourth_number1.onItemSelectedListener=mItemSelectedListener
        fourth_number2.onItemSelectedListener=mItemSelectedListener
        fourth_number3.onItemSelectedListener=mItemSelectedListener
        fourth_number4.onItemSelectedListener=mItemSelectedListener
        fourth_number5.onItemSelectedListener=mItemSelectedListener
        fourth_number6.onItemSelectedListener=mItemSelectedListener

        fifth_number1.onItemSelectedListener=mItemSelectedListener
        fifth_number2.onItemSelectedListener=mItemSelectedListener
        fifth_number3.onItemSelectedListener=mItemSelectedListener
        fifth_number4.onItemSelectedListener=mItemSelectedListener
        fifth_number5.onItemSelectedListener=mItemSelectedListener
        fifth_number6.onItemSelectedListener=mItemSelectedListener
    }

    private fun onFirstGameItemSelected(parent: AdapterView<*>, position: Int){
        val selectedNumber=Integer.parseInt(parent.getItemAtPosition(position) as String)
        when(parent.id){
            R.id.first_number1->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number1,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[0]=selectedNumber
            }
            R.id.first_number2->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number2,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[1]=selectedNumber
            }
            R.id.first_number3->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number3,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[2]=selectedNumber
            }
            R.id.first_number4->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number4,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[3]=selectedNumber
            }
            R.id.first_number5->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number5,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[4]=selectedNumber
            }
            R.id.first_number6->if(isDuplication(mFirstGameNumbers, selectedNumber)){
                showDuplicationDialog(first_number6,mFirstGameNumbers)
            }else{
                mFirstGameNumbers[5]=selectedNumber
            }
        }
    }

    private fun onSecondGameItemSelected(parent: AdapterView<*>, position: Int){
        val selectedNumber=Integer.parseInt(parent.getItemAtPosition(position) as String)
        when(parent.id){
            R.id.second_number1->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number1,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[0]=selectedNumber
            }
            R.id.second_number2->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number2,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[1]=selectedNumber
            }
            R.id.second_number3->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number3,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[2]=selectedNumber
            }
            R.id.second_number4->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number4,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[3]=selectedNumber
            }
            R.id.second_number5->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number5,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[4]=selectedNumber
            }
            R.id.second_number6->if(isDuplication(mSecondGameNumbers, selectedNumber)){
                showDuplicationDialog(second_number6,mSecondGameNumbers)
            }else{
                mSecondGameNumbers[5]=selectedNumber
            }
        }
    }
    private fun onThirdGameItemSelected(parent: AdapterView<*>, position: Int){
        val selectedNumber=Integer.parseInt(parent.getItemAtPosition(position) as String)
        when(parent.id){
            R.id.third_number1->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number1,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[0]=selectedNumber
            }
            R.id.third_number2->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number2,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[1]=selectedNumber
            }
            R.id.third_number3->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number3,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[2]=selectedNumber
            }
            R.id.third_number4->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number4,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[3]=selectedNumber
            }
            R.id.third_number5->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number5,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[4]=selectedNumber
            }
            R.id.third_number6->if(isDuplication(mThirdGameNumbers, selectedNumber)){
                showDuplicationDialog(third_number6,mThirdGameNumbers)
            }else{
                mThirdGameNumbers[5]=selectedNumber
            }
        }
    }
    private fun onFourthGameItemSelected(parent: AdapterView<*>, position: Int){
        val selectedNumber=Integer.parseInt(parent.getItemAtPosition(position) as String)
        when(parent.id){
            R.id.fourth_number1->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number1,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[0]=selectedNumber
            }
            R.id.fourth_number2->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number2,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[1]=selectedNumber
            }
            R.id.fourth_number3->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number3,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[2]=selectedNumber
            }
            R.id.fourth_number4->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number4,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[3]=selectedNumber
            }
            R.id.fourth_number5->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number5,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[4]=selectedNumber
            }
            R.id.fourth_number6->if(isDuplication(mFourthGameNumbers, selectedNumber)){
                showDuplicationDialog(fourth_number6,mFourthGameNumbers)
            }else{
                mFourthGameNumbers[5]=selectedNumber
            }
        }
    }

    private fun resetNumber(gameNumber: Spinner){
        gameNumber.setSelection(0);
    }

    private fun onFifthGameItemSelected(parent: AdapterView<*>, position: Int){
        val selectedNumber=Integer.parseInt(parent.getItemAtPosition(position) as String)
        when(parent.id){
            R.id.fifth_number1->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number1,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[0]=selectedNumber
            }
            R.id.fifth_number2->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number2,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[1]=selectedNumber
            }
            R.id.fifth_number3->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number3,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[2]=selectedNumber
            }
            R.id.fifth_number4->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number4,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[3]=selectedNumber
            }
            R.id.fifth_number5->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number5,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[4]=selectedNumber
            }
            R.id.fifth_number6->if(isDuplication(mFifthGameNumbers, selectedNumber)){
                showDuplicationDialog(fifth_number6,mFifthGameNumbers)
            }else{
                mFifthGameNumbers[5]=selectedNumber
            }
        }
    }

    @Synchronized
    private fun setRandomNumber(gameNumber: Spinner?, gameNumbers: Map<Int, Int>, time: Long, button: Button?){
        Handler().postDelayed({
            gameNumber?.setSelection(getRandomNumber(gameNumbers))
            if(time==500L){
                button?.isEnabled=true
            }
        },time)
    }

    private fun setButton() {
        first_random.setOnClickListener {
            first_random.isEnabled = false
            mFirstGameNumbers.clear()
            setRandomNumber(first_number1, mFirstGameNumbers, 0, first_random)
            setRandomNumber(first_number2, mFirstGameNumbers, 100, first_random)
            setRandomNumber(first_number3, mFirstGameNumbers, 200, first_random)
            setRandomNumber(first_number4, mFirstGameNumbers, 300, first_random)
            setRandomNumber(first_number5, mFirstGameNumbers, 400, first_random)
            setRandomNumber(first_number6, mFirstGameNumbers, 500, first_random)
        }
        second_random.setOnClickListener {
            second_random.isEnabled = false
            mSecondGameNumbers.clear()
            setRandomNumber(second_number1, mFirstGameNumbers, 0, second_random)
            setRandomNumber(second_number2, mFirstGameNumbers, 100, second_random)
            setRandomNumber(second_number3, mFirstGameNumbers, 200, second_random)
            setRandomNumber(second_number4, mFirstGameNumbers, 300, second_random)
            setRandomNumber(second_number5, mFirstGameNumbers, 400, second_random)
            setRandomNumber(second_number6, mFirstGameNumbers, 500, second_random)
        }
        third_random.setOnClickListener {
            third_random.isEnabled = false
            mThirdGameNumbers.clear()
            setRandomNumber(third_number1, mFirstGameNumbers, 0, third_random)
            setRandomNumber(third_number2, mFirstGameNumbers, 100, third_random)
            setRandomNumber(third_number3, mFirstGameNumbers, 200, third_random)
            setRandomNumber(third_number4, mFirstGameNumbers, 300, third_random)
            setRandomNumber(third_number5, mFirstGameNumbers, 400, third_random)
            setRandomNumber(third_number6, mFirstGameNumbers, 500, third_random)
        }
        fourth_random.setOnClickListener {
            fourth_random.isEnabled = false
            mFourthGameNumbers.clear()
            setRandomNumber(fourth_number1, mFirstGameNumbers, 0, fourth_random)
            setRandomNumber(fourth_number2, mFirstGameNumbers, 100, fourth_random)
            setRandomNumber(fourth_number3, mFirstGameNumbers, 200, fourth_random)
            setRandomNumber(fourth_number4, mFirstGameNumbers, 300, fourth_random)
            setRandomNumber(fourth_number5, mFirstGameNumbers, 400, fourth_random)
            setRandomNumber(fourth_number6, mFirstGameNumbers, 500, fourth_random)
        }
        fifth_random.setOnClickListener {
            fifth_random.isEnabled = false
            mFifthGameNumbers.clear()
            setRandomNumber(fifth_number1, mFirstGameNumbers, 0, fifth_random)
            setRandomNumber(fifth_number2, mFirstGameNumbers, 100, fifth_random)
            setRandomNumber(fifth_number3, mFirstGameNumbers, 200, fifth_random)
            setRandomNumber(fifth_number4, mFirstGameNumbers, 300, fifth_random)
            setRandomNumber(fifth_number5, mFirstGameNumbers, 400, fifth_random)
            setRandomNumber(fifth_number6, mFirstGameNumbers, 500, fifth_random)
        }

        reset_button.setOnClickListener {
            resetNumber(first_number1)
            resetNumber(first_number2)
            resetNumber(first_number3)
            resetNumber(first_number4)
            resetNumber(first_number5)
            resetNumber(first_number6)

            resetNumber(second_number1)
            resetNumber(second_number2)
            resetNumber(second_number3)
            resetNumber(second_number4)
            resetNumber(second_number5)
            resetNumber(second_number6)

            resetNumber(third_number1)
            resetNumber(third_number2)
            resetNumber(third_number3)
            resetNumber(third_number4)
            resetNumber(third_number5)
            resetNumber(third_number6)

            resetNumber(fourth_number1)
            resetNumber(fourth_number2)
            resetNumber(fourth_number3)
            resetNumber(fourth_number4)
            resetNumber(fourth_number5)
            resetNumber(fourth_number6)

            resetNumber(fifth_number1)
            resetNumber(fifth_number2)
            resetNumber(fifth_number3)
            resetNumber(fifth_number4)
            resetNumber(fifth_number5)
            resetNumber(fifth_number6)

            setWinNumber()
            win_text.text = "win"
            result_text.text = "result"
        }

        result_button.setOnClickListener(object : View.OnClickListener {
            var isAllSelected: Boolean = false
            override fun onClick(v: View) {
                val toast: Toast
                isAllSelected = true
                if (mFirstGameNumbers.containsValue(0)) {
                    isAllSelected = false
                    toast = Toast.makeText(applicationContext, "1번 게임 미선택 존재!!", Toast.LENGTH_SHORT)
                    toast.show()
                } else if (mSecondGameNumbers.containsValue(0)) {
                    isAllSelected = false
                    toast = Toast.makeText(applicationContext, "2번 게임 미선택 존재!!", Toast.LENGTH_SHORT)
                    toast.show()
                } else if (mThirdGameNumbers.containsValue(0)) {
                    isAllSelected = false
                    toast = Toast.makeText(applicationContext, "3번 게임 미선택 존재!!", Toast.LENGTH_SHORT)
                    toast.show()
                } else if (mFourthGameNumbers.containsValue(0)) {
                    isAllSelected = false
                    toast = Toast.makeText(applicationContext, "4번 게임 미선택 존재!!", Toast.LENGTH_SHORT)
                    toast.show()
                } else if (mFifthGameNumbers.containsValue(0)) {
                    isAllSelected = false
                    toast = Toast.makeText(applicationContext, "5번 게임 미선택 존재!!", Toast.LENGTH_SHORT)
                    toast.show()
                }

                if (isAllSelected) {
                    win_text.text =
                        ("당첨 번호 : " + mWinNumbers[0] + " " + mWinNumbers[1] + " " + mWinNumbers[2] + " " + mWinNumbers[3] + " " + mWinNumbers[4] + " " + mWinNumbers[5] + "보너스 : " + mBonusNum)
                    mResultText = StringBuilder("")
                    isWin(mFirstGameNumbers, 1)
                    isWin(mSecondGameNumbers, 2)
                    isWin(mThirdGameNumbers, 3)
                    isWin(mFourthGameNumbers, 4)
                    isWin(mFifthGameNumbers, 5)
                }
            }
        })
    }

    private fun showDuplicationDialog(gameNumber: Spinner, gameNumbers: Map<Int, Int>){
        val alert=AlertDialog.Builder(this@MainActivity)
        alert.setTitle("알림")
            .setMessage("이미 선택한 숫자입니다.")
            .setCancelable(false)
            .setPositiveButton(
                "자동선택"
            ){dialog, which->gameNumber.setSelection(getRandomNumber(gameNumbers))}
            .setNegativeButton(
                "다시 선택"
            ){dialog, which->gameNumber.setSelection(0)}

        alert.show()
    }

    private fun getRandomNumber(gameNumbers: Map<Int, Int>) : Int{
        val generator = Random()
        var num=generator.nextInt(45)+1
        while(isDuplication(gameNumbers, num)){
            num=generator.nextInt(45)+1
        }
        return num
    }

    private fun isDuplication(gameNumbers: Map<Int, Int>, selectedNumber: Int) : Boolean{
        return gameNumbers.containsValue(selectedNumber)&&selectedNumber!=0
    }

    private fun setWinNumber(){
        for (i in 0..5){
            mWinNumbers[i] = getRandomNumber(mWinNumbers)
        }
        mBonusNum=getRandomNumber(mWinNumbers)
    }

    private fun resultWin(numbers: Map<Int, Int>) : Int{
        var count = 7
        for (i in 0..5){
            if(mWinNumbers.containsValue(numbers[i])){
                count--
            }
        }

        if(count==2){
            if(!numbers.containsValue(mBonusNum)){
                count++
            }
        }

        return count
    }

    private fun isWin(gameNumbers: Map<Int, Int>, gameNum: Int){
        if(resultWin(gameNumbers)>5){
            mResultText.append(gameNum.toString()+"번 꽝!")
        }else{
            mResultText.append(gameNum.toString()+"번 "+resultWin(gameNumbers)+"등! ")
        }

        result_text.text=mResultText
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
        setButton()
        setWinNumber()
    }
}