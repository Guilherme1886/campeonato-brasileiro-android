package com.guilhermeantonio.campeonatobrasileiro.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import com.guilhermeantonio.campeonatobrasileiro.R
import com.guilhermeantonio.campeonatobrasileiro.adapter.TimeAdapter
import com.guilhermeantonio.campeonatobrasileiro.model.TimeModel
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.longToast
import java.util.ArrayList

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var listTimes = arrayListOf<TimeModel>()
    private var mAdapter: TimeAdapter? = null
    private var objWhisky: TimeModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configMenuLateralAndToolbar()


    }

    private fun configMenuLateralAndToolbar() {

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.nav_serie_a) {

            mAdapter = TimeAdapter(TimeModel().getTimesSerieA(), this@MainActivity, object : TimeAdapter.OnItemClickListener {
                override fun OnItemClickFoto(itemTime: TimeModel) {

                    longToast(itemTime.nome.toString())



                }

            })


            recycler_view_times.layoutManager = GridLayoutManager(this@MainActivity, 2)
            recycler_view_times.adapter = mAdapter
            progressBar.visibility = View.INVISIBLE

        } else if (id == R.id.nav_serie_b) {


        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        val id = item.itemId
//
//        if (id == R.id.action_settings) {
//            return true
//        }
//
//        return super.onOptionsItemSelected(item)
//    }


}
